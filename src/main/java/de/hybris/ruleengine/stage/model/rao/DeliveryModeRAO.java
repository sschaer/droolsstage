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
package de.hybris.ruleengine.stage.model.rao;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;


@Data
public class DeliveryModeRAO implements Serializable
{
	private String code;
	private BigDecimal cost;
	private String currencyIsoCode;
}
