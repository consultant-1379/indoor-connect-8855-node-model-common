   /*------------------------------------------------------------------------------
   2  *******************************************************************************
   3  * COPYRIGHT Ericsson 2019
   4  *
   5  * The copyright to the computer program(s) herein is the property of
   6  * Ericsson Inc. The programs may be used and/or copied only with written
   7  * permission from Ericsson Inc. or in accordance with the terms and
   8  * conditions stipulated in the agreement/contract under which the
   9  * program(s) have been supplied.
  10  *******************************************************************************
  11  *----------------------------------------------------------------------------*/
  package com.ericsson.oss.mediation.model.ci.IndoorConnect8855;
 
   
  import com.ericsson.mediation.model.ci.ConnectivityInformation_100;
  import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.AttributeChangeEventHandling;
  import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.CommonChangeEventBehavior;
  import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.Hierarchical;
  import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.OnReadWrite;
  import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeAttribute;
  import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeChangeEventBehavior;
  import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeChangeEventHandling;
  import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeDefinition;
  import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.ReadBehavior;
  import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.WriteBehavior;
  import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
  import com.ericsson.oss.itpf.modeling.annotation.EModel;
  import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
  import com.ericsson.oss.itpf.modeling.annotation.IpAddress;
  import com.ericsson.oss.itpf.modeling.annotation.constraints.Max;
  import com.ericsson.oss.itpf.modeling.annotation.constraints.Min;
  import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;
   
  @EModel(description = "This MO encapsulates all the connectivity attributes for the Indoor-Connect-8855 node.",
  name = "Ic8855ConnectivityInformation", namespace = "INDOOR_CONNECT_MED", version = "1.0.0")
  @PrimaryTypeDefinition
  @Hierarchical(parentMoTypeUrn = "")
  @OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_DELEGATE)
  @PrimaryTypeChangeEventHandling(onCreatePo = { PrimaryTypeChangeEventBehavior.NAMES, PrimaryTypeChangeEventBehavior.VALUES }, onDeletePo = {
  PrimaryTypeChangeEventBehavior.NAMES, PrimaryTypeChangeEventBehavior.VALUES })
   
  public class Ic8855ConnectivityInformation extends ConnectivityInformation_100 {
   
         @PrimaryTypeAttribute
         @EModelAttribute(description = "The unique key identifying this particular MO", mandatory = true, immutable = true, key = true)
         @NotNull
         private String Ic8855ConnectivityInformationId;
    
        @PrimaryTypeAttribute
        @EModelAttribute(description = "The IP address", mandatory = true)
        @AttributeChangeEventHandling(onModifyAttr = { CommonChangeEventBehavior.VALUE })
        @IpAddress
        @NotNull
        private String ipAddress;
		
        @PrimaryTypeAttribute
        @EModelAttribute(description = "The port number of the node where the SNMP agent is listening.", mandatory = false)
        @DefaultValue(value = "161")
        @Min(value = 1)
        @Max(value = 65535)
        private int snmpAgentPort;

        @PrimaryTypeAttribute
        @EModelAttribute(description = "Snmp version", mandatory = false)
        @DefaultValue(value = "SNMP_V3")
        private SnmpVersion_100 snmpVersion;

        @PrimaryTypeAttribute
        @EModelAttribute(description = "The port number where ENM is listening to SNMP traps.", mandatory = false)
        @DefaultValue(value = "162")
        @Min(value = 1)
        @Max(value = 65535)
        private int snmpTrapPort;
  
        @PrimaryTypeAttribute
        @EModelAttribute(description = "SNMP security name for v3 protocol", mandatory = false)
        private String snmpSecurityName;
   
        @PrimaryTypeAttribute
        @EModelAttribute(description = "SNMP Security level for v3 protocol", mandatory = false)
        private SnmpSecurityLevelType_100 snmpSecurityLevel;
   
   
        @PrimaryTypeAttribute
        @EModelAttribute(description = "Community string to be used for SNMP GET management", mandatory = false)
        @DefaultValue(value = "public")
        private String snmpReadCommunity;
   
        @PrimaryTypeAttribute
        @EModelAttribute(description = "Community string to be used for SNMP SET management", mandatory = false)
        @DefaultValue(value = "private")
        private String snmpWriteCommunity;


        @PrimaryTypeAttribute
        @EModelAttribute(description = "The SFTP port currently listening", mandatory = false)
        @DefaultValue(value = "27")
        private String sftpPort;

        @PrimaryTypeAttribute
        @EModelAttribute(description = "The username string to be used for SFTP SET management", mandatory = false)
        @DefaultValue(value = "rlogxrf")
        private String sftpUsername;
   
    }
