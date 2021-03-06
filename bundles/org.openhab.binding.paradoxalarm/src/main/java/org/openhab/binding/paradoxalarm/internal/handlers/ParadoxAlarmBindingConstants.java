/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.paradoxalarm.internal.handlers;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.smarthome.core.library.types.StringType;
import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link ParadoxAlarmBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Konstantin Polihronov - Initial contribution
 */
@NonNullByDefault
public class ParadoxAlarmBindingConstants {

    private static final String BINDING_ID = "paradoxalarm";

    private static final String PARADOX_COMMUNICATOR_THING_TYPE_ID = "ip150";

    private static final String PARADOX_PANEL_THING_TYPE_ID = "panel";

    private static final String PARTITION_THING_TYPE_ID = "partition";

    private static final String ZONE_THING_TYPE_ID = "zone";

    // List of all Thing Type UIDs
    public static final ThingTypeUID COMMUNICATOR_THING_TYPE_UID = new ThingTypeUID(BINDING_ID,
            PARADOX_COMMUNICATOR_THING_TYPE_ID);
    public static final ThingTypeUID PANEL_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, PARADOX_PANEL_THING_TYPE_ID);
    public static final ThingTypeUID PARTITION_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, PARTITION_THING_TYPE_ID);
    public static final ThingTypeUID ZONE_THING_TYPE_UID = new ThingTypeUID(BINDING_ID, ZONE_THING_TYPE_ID);

    // List of all Channel UIDs
    public static final String IP150_COMMUNICATION_COMMAND_CHANNEL_UID = "communicationCommand";

    public static final String PANEL_STATE_CHANNEL_UID = "state";
    public static final String PANEL_SERIAL_NUMBER_PROPERTY_NAME = "serialNumber";
    public static final String PANEL_TYPE_PROPERTY_NAME = "panelType";
    public static final String PANEL_HARDWARE_VERSION_PROPERTY_NAME = "hardwareVersion";
    public static final String PANEL_APPLICATION_VERSION_PROPERTY_NAME = "applicationVersion";
    public static final String PANEL_BOOTLOADER_VERSION_PROPERTY_NAME = "bootloaderVersion";

    public static final String PARTITION_ADDITIONAL_STATES_CHANNEL_UID = "additionalStates";
    public static final String PARTITION_STATE_CHANNEL_UID = "state";
    public static final String PARTITION_LABEL_CHANNEL_UID = "partitionLabel";

    public static final String ZONE_LABEL_CHANNEL_UID = "zoneLabel";
    public static final String ZONE_OPENED_CHANNEL_UID = "opened";
    public static final String ZONE_TAMPERED_CHANNEL_UID = "tampered";
    public static final String ZONE_LOW_BATTERY_CHANNEL_UID = "lowBattery";

    // Misc constants
    public static final StringType STATE_OFFLINE = new StringType("Offline");
    public static final StringType STATE_ONLINE = new StringType("Online");

}
