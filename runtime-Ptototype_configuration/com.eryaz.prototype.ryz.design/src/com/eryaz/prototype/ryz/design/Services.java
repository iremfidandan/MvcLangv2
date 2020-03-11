package com.eryaz.prototype.ryz.design;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.*;
import com.eryaz.prototype.ryz.*;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    //-------------------------------------------------------------------------------------------
    
    public String getHelperForSendingRequestLabelExpression(HelperForSendingRequest helper) {
		
    	String streotype = "<<" + helper.eClass().getName() + ">>";
    	
    	String requestTypeField = "   RequestType = " + helper.getRequestType().toString() + ",   ";
    	String httpMethodField = "   HttpMethod = " + helper.getHttpMethod().toString() + "   ";
    	int bodyMaxLength = Integer.max(requestTypeField.length(), httpMethodField.length());
    	String bodyExpression = Arrays.asList("{", requestTypeField, httpMethodField, "}").stream().collect(Collectors.joining("\n"));
    	
		String textExpression = helper.getText().toString();
		
	
		int width = Integer.max(bodyMaxLength, textExpression.length());
	
		streotype = String.format("%" + width + "s", streotype);
		textExpression = String.format("%" + width + "s", textExpression);
		
		return Arrays.asList(streotype, textExpression, bodyExpression).stream().collect(Collectors.joining("\n"));
    }
    
    //--------------------------------------------------------------------------------------------
    
    public String getActionMethodLabelExpression(ActionMethod actionMethod) {
    	String streotype = "<<" + actionMethod.eClass().getName() + ">>";
    	String httpMethod = "[" + actionMethod.getHttpMethod().toString() + "]";
    	int headerMaxLength = Integer.max(streotype.length(), httpMethod.length());
    	
    	String actionMethodParameters = actionMethod.getParameters().stream().map(m -> getActionMethodParameterExpression(m)).collect(Collectors.joining(", "));
    	String actionMethodSignature = actionMethod.getName() + "(" + actionMethodParameters + "): " + actionMethod.getReturns().toString();
    	
    	int width = Integer.max(headerMaxLength, actionMethodSignature.length());
    	
    	streotype = String.format("%" + width + "s", streotype);
    	
    	return Arrays.asList(streotype, httpMethod, actionMethodSignature).stream().collect(Collectors.joining("\n"));
    }
    
    public String getActionMethodParameterExpression(Parameter parameter) {
    	String parameterExpression = "";
    	
    	if(parameter.is›sList()) {
    		parameterExpression = "List<" + parameter.getType().toString() + "> " + parameter.getName();
    	}
    	else {
    		parameterExpression = parameter.getType().toString() + " " + parameter.getName();
    	}
    	
    	return parameterExpression;
    }
        
    //-----------------------------------------------------------------------------------------
    
    public String getTableKeyNodeLabel(TableKey tableKey) {
    	
    	String isRequired = tableKey.is›sRequired() ? "[1..1]" : "[0..1]";
    	
    	String keyConstraints = "";
    	
    	List<String> keyConstraintsList = new ArrayList<>();
    	
    	if(tableKey.is›sPrimaryKey()) {
    		keyConstraintsList.add("PK");
    	}
    	if(tableKey.is›sForeignKey()) {
    		keyConstraintsList.add("FK");
    	}
    	
    	if(!keyConstraintsList.isEmpty()) {
    		keyConstraints = "(" + keyConstraintsList.stream().collect(Collectors.joining(", ")) + ")";
    	}
    	
    	return String.format("%s : %s %s %s", tableKey.getName(), tableKey.getType().toString(), isRequired, keyConstraints);
    }
    
    //------------------------------------------------------------------------------------------------------------------------
    
    public Set<ModelAssociation> getAllProjectModelAssociations(Model model) {
    	Project project = (Project)model.eContainer().eContainer();
    	
    	Set<ModelPackage> modelPackages = project.getPackages().stream().filter(p -> p instanceof ModelPackage).map(m -> (ModelPackage) m).collect(Collectors.toSet());
    	Set<ModelAssociation> modelAssociations = modelPackages.stream().flatMap(m -> m.getModelassociations().stream()).collect(Collectors.toSet());
    	
    	return modelAssociations;
    }
    
    public Set<ModelAssociation> getProjectModelAssociationWhereModelIsPrincipal(Model model){
    	return getAllProjectModelAssociations(model).stream().filter(m -> m.getPrincipal() == model).collect(Collectors.toSet());
    }
    
    public Set<Model> getProjectModelAssociationWhereModelIsPrincipalDependents(Model model){
    	return getProjectModelAssociationWhereModelIsPrincipal(model).stream().map(m -> m.getDependent()).collect(Collectors.toSet());
    }
    
    //---------------------------------------------------------------------------------------------------------------------------
}
