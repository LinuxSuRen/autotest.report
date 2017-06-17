/*
 *
 *  * Copyright 2002-2007 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.surenpi.autotest.report.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author suren
 */
public abstract class DateUtils
{
    public static final String DEF_DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
    public static final SimpleDateFormat format = new SimpleDateFormat(DEF_DATE_FORMAT);

    public static final String getDateText(long time)
    {
        return format.format(new Date(time));
    }
}
