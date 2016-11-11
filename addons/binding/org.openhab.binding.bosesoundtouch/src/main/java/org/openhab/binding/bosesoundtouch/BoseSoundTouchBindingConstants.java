/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.bosesoundtouch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link BoseSoundTouchBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Christian Niessner - Initial contribution
 */
public class BoseSoundTouchBindingConstants {

    public static final String BINDING_ID = "bosesoundtouch";

    // This is the master bridge
    public final static ThingTypeUID BRIDGE_THING_TYPE = new ThingTypeUID(BINDING_ID, "bridge");

    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_DEVICE = new ThingTypeUID(BINDING_ID, "device");
    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_SAMPLE = new ThingTypeUID(BINDING_ID, "sample");

    // all thing types
    public final static Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = new HashSet<ThingTypeUID>(
            Arrays.asList(THING_TYPE_DEVICE));

    // List of all Channel ids
    public static final String CHANNEL_OPERATION_MODE = "operationMode";
    public static final String CHANNEL_VOLUME = "volume";
    public static final String CHANNEL_MUTE = "mute";
    public static final String CHANNEL_RADIO_STATION = "radioStation";
    public static final String CHANNEL_PLAYER_CONTROL = "playerControl";
    public static final String CHANNEL_ZONE = "zone";
    public static final String CHANNEL_KEY_CODE = "keyCode";
    public static final String CHANNEL_NOW_PLAYING_ALBUM = "nowPlayingAlbum";
    public static final String CHANNEL_NOW_PLAYING_ARTWORK = "nowPlayingArtwork";
    public static final String CHANNEL_NOW_PLAYING_ARTIST = "nowPlayingArtist";
    public static final String CHANNEL_NOW_PLAYING_DESCRIPTION = "nowPlayingDescription";
    public static final String CHANNEL_NOW_PLAYING_ITEMNAME = "nowPlayingItemName";
    public static final String CHANNEL_NOW_PLAYING_STATION_LOCATION = "nowPlayingStationLocation";
    public static final String CHANNEL_NOW_PLAYING_STATION_NAME = "nowPlayingStationName";
    public static final String CHANNEL_NOW_PLAYING_PLAY_STATUS = "nowPlayingPlayStatus";
    public static final String CHANNEL_NOW_PLAYING_TRACK = "nowPlayingTrack";

    // Device configuration parameters;
    public static final String DEVICE_PARAMETER_HOST = "DEVICE_HOST";
    public static final String DEVICE_PARAMETER_PORT = "DEVICE_PORT";
    public static final String DEVICE_PARAMETER_MAC = "DEVICE_MAC";
    public static final String DEVICE_PARAMETER_DEFAULT_RADIO_STATION = "DEFAULT_RADIO_STATION";

    public static final String DEVICE_INFO_NAME = "INFO_NAME";
    public static final String DEVICE_INFO_TYPE = "INFO_TYPE";

}
