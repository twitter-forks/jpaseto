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
package dev.paseto.jpaseto.crypto.bouncycastle;

import com.google.auto.service.AutoService;
import dev.paseto.jpaseto.impl.crypto.JcaV1PublicCryptoProvider;
import dev.paseto.jpaseto.crypto.V1PublicCryptoProvider;

@AutoService(V1PublicCryptoProvider.class)
public class BouncyCastleV1PublicCryptoProvider extends JcaV1PublicCryptoProvider {

    public BouncyCastleV1PublicCryptoProvider() {
        BouncyCastleInitializer.enableBouncyCastle();
    }
}
