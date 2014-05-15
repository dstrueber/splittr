package de.uni_marburg.splittr;

import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.BundleContext;

import de.uni_marburg.splittr.description.splittr.SplittrPackage;
import de.uni_marburg.splittr.splittrResult.SplittrResultPackage;

public class Activator extends Plugin {
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		initialize();
	}

	private void initialize() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());

		SplittrPackage.eINSTANCE.eClass(); // Initialize the Splittr Description
											// package
		SplittrResultPackage.eINSTANCE.eClass(); // Initialize the Splittr Result package
	}
}
