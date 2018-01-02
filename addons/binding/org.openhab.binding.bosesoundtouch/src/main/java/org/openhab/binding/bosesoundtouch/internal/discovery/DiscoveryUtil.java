/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.bosesoundtouch.internal.discovery;

import java.io.IOException;
import org.eclipse.smarthome.io.net.http.HttpUtil;

/**
 * The {@link DiscoveryUtil} is a static helper class, to get infos from a XML
 *
 * @author Thomas Traunbauer - Initial contribution
 */
public class DiscoveryUtil {

    /**
     * Finds the content in an element
     *
     * This is a quick and dirty method, it always delivers the first appearance of content in an element
     */
    public static String getContentOfFirstElement(String content, String element) {
        if (content == null) {
            return "";
        }
        String beginTag = "<" + element + ">";
        String endTag = "</" + element + ">";

        int startIndex = content.indexOf(beginTag) + beginTag.length();
        int endIndex = content.indexOf(endTag);

        if (startIndex != -1 && endIndex != -1) {
            return content.substring(startIndex, endIndex);
        } else {
            return "";
        }
    }

    /**
     * Executes an URL and returns to answer
     */
    public static String executeUrl(String url) throws IOException {
        return HttpUtil.executeUrl("GET", url, 5000);
    }
}
