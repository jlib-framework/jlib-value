/*
 * jlib - Open Source Java Library
 *
 *     www.jlib.org
 *
 *
 *     Copyright 2005-2018 Igor Akkerman
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package org.jlib.value;

/**
 * {@link Modifiable} {@link Initialized} by a {@link Value}.
 *
 * @param <Value>
 *        type of the value
 *
 * @author Igor Akkerman
 */
public class InitializedModifiable<Value>
    extends Initialized<Value>
    implements Modifiable<Value> {

    /**
     * Creates a new {@link InitializedModifiable}.
     *
     * @param initialValue
     *        initial {@link Value}
     *
     * @throws IllegalArgumentException
     *         if {@code initialValue} is invalid
     */
    public InitializedModifiable(final Value initialValue)
        throws IllegalArgumentException {
        super(initialValue);
    }

    @Override
    // raising visibility from protected to public
    public void set(final Value value) {
        super.set(value);
    }
}
