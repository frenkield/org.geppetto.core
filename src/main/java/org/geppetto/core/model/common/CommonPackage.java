/**
 */
package org.geppetto.core.model.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.geppetto.core.model.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.geppetto.model.common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.geppetto.model.common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = org.geppetto.core.model.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.geppetto.core.model.common.impl.StateInstancePathImpl <em>State Instance Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.core.model.common.impl.StateInstancePathImpl
	 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getStateInstancePath()
	 * @generated
	 */
	int STATE_INSTANCE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Instance Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INSTANCE_PATH__INSTANCE_PATH = 0;

	/**
	 * The number of structural features of the '<em>State Instance Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INSTANCE_PATH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.geppetto.core.model.common.impl.StateInstancePathToAValueMapImpl <em>State Instance Path To AValue Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.core.model.common.impl.StateInstancePathToAValueMapImpl
	 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getStateInstancePathToAValueMap()
	 * @generated
	 */
	int STATE_INSTANCE_PATH_TO_AVALUE_MAP = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INSTANCE_PATH_TO_AVALUE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INSTANCE_PATH_TO_AVALUE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>State Instance Path To AValue Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INSTANCE_PATH_TO_AVALUE_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.geppetto.core.model.common.impl.StateSetImpl <em>State Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.core.model.common.impl.StateSetImpl
	 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getStateSet()
	 * @generated
	 */
	int STATE_SET = 2;

	/**
	 * The feature id for the '<em><b>States</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SET__STATES = 0;

	/**
	 * The number of structural features of the '<em>State Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SET_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.geppetto.core.model.common.ISimulator <em>ISimulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.core.model.common.ISimulator
	 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getISimulator()
	 * @generated
	 */
	int ISIMULATOR = 3;

	/**
	 * The number of structural features of the '<em>ISimulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISIMULATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.core.model.common.IModel <em>IModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.core.model.common.IModel
	 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getIModel()
	 * @generated
	 */
	int IMODEL = 4;

	/**
	 * The number of structural features of the '<em>IModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMODEL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geppetto.core.model.common.impl.RunConfigurationImpl <em>Run Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.core.model.common.impl.RunConfigurationImpl
	 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getRunConfiguration()
	 * @generated
	 */
	int RUN_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_CONFIGURATION__TIME_STEP = 0;

	/**
	 * The feature id for the '<em><b>Run Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_CONFIGURATION__RUN_LENGTH = 1;

	/**
	 * The number of structural features of the '<em>Run Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_CONFIGURATION_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.geppetto.core.model.common.impl.ASimulatorImpl <em>ASimulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geppetto.core.model.common.impl.ASimulatorImpl
	 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getASimulator()
	 * @generated
	 */
	int ASIMULATOR = 6;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIMULATOR__INITIALIZED = ISIMULATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ASimulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIMULATOR_FEATURE_COUNT = ISIMULATOR_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.geppetto.core.model.common.StateInstancePath <em>State Instance Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Instance Path</em>'.
	 * @see org.geppetto.core.model.common.StateInstancePath
	 * @generated
	 */
	EClass getStateInstancePath();

	/**
	 * Returns the meta object for the attribute list '{@link org.geppetto.core.model.common.StateInstancePath#getInstancePath <em>Instance Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Instance Path</em>'.
	 * @see org.geppetto.core.model.common.StateInstancePath#getInstancePath()
	 * @see #getStateInstancePath()
	 * @generated
	 */
	EAttribute getStateInstancePath_InstancePath();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>State Instance Path To AValue Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Instance Path To AValue Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.geppetto.core.model.common.StateInstancePath"
	 *        valueType="org.geppetto.core.model.values.AValue" valueMany="true"
	 * @generated
	 */
	EClass getStateInstancePathToAValueMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStateInstancePathToAValueMap()
	 * @generated
	 */
	EReference getStateInstancePathToAValueMap_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStateInstancePathToAValueMap()
	 * @generated
	 */
	EReference getStateInstancePathToAValueMap_Value();

	/**
	 * Returns the meta object for class '{@link org.geppetto.core.model.common.StateSet <em>State Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Set</em>'.
	 * @see org.geppetto.core.model.common.StateSet
	 * @generated
	 */
	EClass getStateSet();

	/**
	 * Returns the meta object for the map '{@link org.geppetto.core.model.common.StateSet#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>States</em>'.
	 * @see org.geppetto.core.model.common.StateSet#getStates()
	 * @see #getStateSet()
	 * @generated
	 */
	EReference getStateSet_States();

	/**
	 * Returns the meta object for class '{@link org.geppetto.core.model.common.ISimulator <em>ISimulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISimulator</em>'.
	 * @see org.geppetto.core.model.common.ISimulator
	 * @generated
	 */
	EClass getISimulator();

	/**
	 * Returns the meta object for class '{@link org.geppetto.core.model.common.IModel <em>IModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IModel</em>'.
	 * @see org.geppetto.core.model.common.IModel
	 * @generated
	 */
	EClass getIModel();

	/**
	 * Returns the meta object for class '{@link org.geppetto.core.model.common.RunConfiguration <em>Run Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Configuration</em>'.
	 * @see org.geppetto.core.model.common.RunConfiguration
	 * @generated
	 */
	EClass getRunConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.core.model.common.RunConfiguration#getTimeStep <em>Time Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Step</em>'.
	 * @see org.geppetto.core.model.common.RunConfiguration#getTimeStep()
	 * @see #getRunConfiguration()
	 * @generated
	 */
	EAttribute getRunConfiguration_TimeStep();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.core.model.common.RunConfiguration#getRunLength <em>Run Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Length</em>'.
	 * @see org.geppetto.core.model.common.RunConfiguration#getRunLength()
	 * @see #getRunConfiguration()
	 * @generated
	 */
	EAttribute getRunConfiguration_RunLength();

	/**
	 * Returns the meta object for class '{@link org.geppetto.core.model.common.ASimulator <em>ASimulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASimulator</em>'.
	 * @see org.geppetto.core.model.common.ASimulator
	 * @generated
	 */
	EClass getASimulator();

	/**
	 * Returns the meta object for the attribute '{@link org.geppetto.core.model.common.ASimulator#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.geppetto.core.model.common.ASimulator#isInitialized()
	 * @see #getASimulator()
	 * @generated
	 */
	EAttribute getASimulator_Initialized();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.geppetto.core.model.common.impl.StateInstancePathImpl <em>State Instance Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.core.model.common.impl.StateInstancePathImpl
		 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getStateInstancePath()
		 * @generated
		 */
		EClass STATE_INSTANCE_PATH = eINSTANCE.getStateInstancePath();

		/**
		 * The meta object literal for the '<em><b>Instance Path</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_INSTANCE_PATH__INSTANCE_PATH = eINSTANCE.getStateInstancePath_InstancePath();

		/**
		 * The meta object literal for the '{@link org.geppetto.core.model.common.impl.StateInstancePathToAValueMapImpl <em>State Instance Path To AValue Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.core.model.common.impl.StateInstancePathToAValueMapImpl
		 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getStateInstancePathToAValueMap()
		 * @generated
		 */
		EClass STATE_INSTANCE_PATH_TO_AVALUE_MAP = eINSTANCE.getStateInstancePathToAValueMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_INSTANCE_PATH_TO_AVALUE_MAP__KEY = eINSTANCE.getStateInstancePathToAValueMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_INSTANCE_PATH_TO_AVALUE_MAP__VALUE = eINSTANCE.getStateInstancePathToAValueMap_Value();

		/**
		 * The meta object literal for the '{@link org.geppetto.core.model.common.impl.StateSetImpl <em>State Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.core.model.common.impl.StateSetImpl
		 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getStateSet()
		 * @generated
		 */
		EClass STATE_SET = eINSTANCE.getStateSet();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_SET__STATES = eINSTANCE.getStateSet_States();

		/**
		 * The meta object literal for the '{@link org.geppetto.core.model.common.ISimulator <em>ISimulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.core.model.common.ISimulator
		 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getISimulator()
		 * @generated
		 */
		EClass ISIMULATOR = eINSTANCE.getISimulator();

		/**
		 * The meta object literal for the '{@link org.geppetto.core.model.common.IModel <em>IModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.core.model.common.IModel
		 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getIModel()
		 * @generated
		 */
		EClass IMODEL = eINSTANCE.getIModel();

		/**
		 * The meta object literal for the '{@link org.geppetto.core.model.common.impl.RunConfigurationImpl <em>Run Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.core.model.common.impl.RunConfigurationImpl
		 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getRunConfiguration()
		 * @generated
		 */
		EClass RUN_CONFIGURATION = eINSTANCE.getRunConfiguration();

		/**
		 * The meta object literal for the '<em><b>Time Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_CONFIGURATION__TIME_STEP = eINSTANCE.getRunConfiguration_TimeStep();

		/**
		 * The meta object literal for the '<em><b>Run Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_CONFIGURATION__RUN_LENGTH = eINSTANCE.getRunConfiguration_RunLength();

		/**
		 * The meta object literal for the '{@link org.geppetto.core.model.common.impl.ASimulatorImpl <em>ASimulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geppetto.core.model.common.impl.ASimulatorImpl
		 * @see org.geppetto.core.model.common.impl.CommonPackageImpl#getASimulator()
		 * @generated
		 */
		EClass ASIMULATOR = eINSTANCE.getASimulator();

		/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIMULATOR__INITIALIZED = eINSTANCE.getASimulator_Initialized();

	}

} //CommonPackage
