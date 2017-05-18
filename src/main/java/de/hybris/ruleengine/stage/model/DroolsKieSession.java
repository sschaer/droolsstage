/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.ruleengine.stage.model;

import de.hybris.ruleengine.stage.DroolsSessionType;

import lombok.Data;


@Data
public class DroolsKieSession
{
	private String name;
	private DroolsSessionType sessionType;
	private RulesBase kieBase;
}
