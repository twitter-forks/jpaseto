/*
 * Copyright 2019-Present paseto.dev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.paseto.jpaseto.lang;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class Bytes {
    private Bytes() {}

    public static byte[] concat(byte[]... inputs) {
        int size = Arrays.stream(inputs).mapToInt(it -> it.length).sum();
        ByteBuffer buffer = ByteBuffer.allocate(size);
        Arrays.stream(inputs).forEach(buffer::put);
        return buffer.array();
    }
}
