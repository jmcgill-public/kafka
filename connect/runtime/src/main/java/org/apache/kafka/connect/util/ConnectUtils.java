/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/
package org.apache.kafka.connect.util;

import org.apache.kafka.common.record.InvalidRecordException;
import org.apache.kafka.common.record.Record;

public final class ConnectUtils {
    public static Long checkAndConvertTimestamp(Long timestamp) {
        if (timestamp == null || timestamp >= 0)
            return timestamp;
        else if (timestamp == Record.NO_TIMESTAMP)
            return null;
        else
            throw new InvalidRecordException(String.format("Invalid record timestamp %d", timestamp));
    }
}
