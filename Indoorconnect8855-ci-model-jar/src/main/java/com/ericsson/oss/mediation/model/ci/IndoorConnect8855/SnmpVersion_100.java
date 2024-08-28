/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.oss.mediation.model.ci.IndoorConnect8855;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtDefinition;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtMember;

/**
 * This represents the types of security level for SNMPv3 nodes
 * <p>
 * Java classes are only used to generate model XML; suffixes are added to the class name to mark current model version. If a new iteration of a model
 * is required then a new class with another version suffix should be created.
 * </p>
 *
 * @since 1.0.0
 */
@EModel(namespace = "INDOOR_CONNECT_MED", name = "SnmpVersion", version = "1.0.0", description = "This represents the version for SNMP protocol")
@EdtDefinition
public enum SnmpVersion_100 {

    @EdtMember(value = 1, description = "SNMP v3")
    SNMP_V3

}