/**
 * 
 */
package org.greenscape.webapp;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * @author BANSS
 * 
 */
@Named
@SessionScoped
public class TemplateBean implements Serializable {
	private static final long serialVersionUID = 1289661495300482132L;

	private String activeTemplate;

	public TemplateBean() {
		activeTemplate = "/WEB-INF/templates/masterLayout.xhtml";
	}

	/**
	 * @return the activeTemplate
	 */
	public String getActiveTemplate() {
		return activeTemplate;
	}

	/**
	 * @param activeTemplate
	 *            the activeTemplate to set
	 */
	public void setActiveTemplate(String activeTemplate) {
		this.activeTemplate = activeTemplate;
	}
}
