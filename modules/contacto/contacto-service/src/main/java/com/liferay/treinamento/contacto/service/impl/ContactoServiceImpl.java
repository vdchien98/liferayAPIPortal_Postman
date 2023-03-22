/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.treinamento.contacto.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.treinamento.contacto.model.Contacto;
import com.liferay.treinamento.contacto.service.base.ContactoServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=contacto",
		"json.web.service.context.path=Contacto"
	},
	service = AopService.class
)
public class ContactoServiceImpl extends ContactoServiceBaseImpl {
	public Contacto addContacto(long groupId, String nome, String telefone, String email, int idade, 
			ServiceContext serviceContext) throws PortalException {
		// Permissao
		return contactoLocalService.addContacto(groupId, nome, telefone, email, idade, serviceContext);
	}
	
	public Contacto updateContacto(long contactoId, String nome, String telefone, String email, int idade) throws PortalException {
		return contactoLocalService.updateContacto(contactoId, nome, telefone, email, idade);
	}
	
	public List<Contacto> getContactosByGroupId(long groupId) {
		return contactoPersistence.findBygroupId(groupId);
	}
	
	public Contacto getContacto(long contactoId) throws PortalException {
		return contactoLocalService.getContacto(contactoId);
	}
	
	
	public Contacto deleteContacto(long contactoId) throws PortalException {
		return contactoLocalService.deleteContacto(contactoId);
	}
}