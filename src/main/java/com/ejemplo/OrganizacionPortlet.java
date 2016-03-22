package com.ejemplo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.taglib.theme.IncludeTag;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class OrganizacionPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {
	// TODO Auto-generated method stub
		try{
			
		
			List<User> userList = UserLocalServiceUtil.getUsers(0, UserLocalServiceUtil.getUsersCount());
			
			
			renderRequest.setAttribute("usuarios", userList );
			
			
			include("/html/organizacion/view.jsp", renderRequest, renderResponse);
		
		}catch (Exception e) {
			
		}
	

		
	}
}
