package com.ericsson.oss.mediation.model.ci.IndoorConnect8855;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtDefinition;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtMember;

/**
 * This represents the types of security level for SNMPv3 nodes
 *
 * <p>
 * Java classes are only used to generate model XML; suffixes are added to the class name to mark current model version. If a new iteration of a model
 * is required then a new class with another version suffix should be created.
 * </p>
 *
 * @since 1.0.0
 */
@EModel(namespace = "INDOOR_CONNECT_MED", name = "SnmpSecurityLevelType", version = "1.0.0", description = "This represents the types of security level for SNMPv3 nodes")
@EdtDefinition
public enum SnmpSecurityLevelType_100 {

    @EdtMember(value = 2, description = "Authenticated but not encrypted") AUTH_NO_PRIV,

    @EdtMember(value = 3, description = "Authenticated and encrypted") AUTH_PRIV

}
