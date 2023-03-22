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

package com.liferay.treinamento.contacto.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Contacto_Contacto&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Contacto
 * @generated
 */
public class ContactoTable extends BaseTable<ContactoTable> {

	public static final ContactoTable INSTANCE = new ContactoTable();

	public final Column<ContactoTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContactoTable, Long> contactoId = createColumn(
		"contactoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ContactoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ContactoTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ContactoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ContactoTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContactoTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ContactoTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ContactoTable, String> nome = createColumn(
		"nome", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContactoTable, String> telefone = createColumn(
		"telefone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContactoTable, Integer> idade = createColumn(
		"idade", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<ContactoTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private ContactoTable() {
		super("Contacto_Contacto", ContactoTable::new);
	}

}