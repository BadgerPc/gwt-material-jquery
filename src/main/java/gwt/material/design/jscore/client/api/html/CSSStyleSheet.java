/*
 * Copyright 2015 Cristian Rinaldi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gwt.material.design.jscore.client.api.html;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Native CSSStyleSheet
 * https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleSheet
 * 
 * @author Cristian Rinaldi
 */
@JsType(isNative = true)
public class CSSStyleSheet extends StyleSheet{
    
    @JsProperty
    public native CSSRuleList getCssRules();
    
    public native void insertRule(String rulem,int index);
    
    public native void deleteRule(int index);
    
}