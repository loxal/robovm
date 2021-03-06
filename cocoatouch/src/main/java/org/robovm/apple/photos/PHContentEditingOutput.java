/*
 * Copyright (C) 2013-2015 Trillian Mobile AB
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
package org.robovm.apple.photos;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHContentEditingOutput/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHContentEditingOutputPtr extends Ptr<PHContentEditingOutput, PHContentEditingOutputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHContentEditingOutput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHContentEditingOutput() {}
    protected PHContentEditingOutput(SkipInit skipInit) { super(skipInit); }
    public PHContentEditingOutput(PHContentEditingInput contentEditingInput) { super((SkipInit) null); initObject(init(contentEditingInput)); }
    public PHContentEditingOutput(PHObjectPlaceholder placeholderForCreatedAsset) { super((SkipInit) null); initObject(init(placeholderForCreatedAsset)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adjustmentData")
    public native PHAdjustmentData getAdjustmentData();
    @Property(selector = "setAdjustmentData:")
    public native void setAdjustmentData(PHAdjustmentData v);
    @Property(selector = "renderedContentURL")
    public native NSURL getRenderedContentURL();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithContentEditingInput:")
    protected native @Pointer long init(PHContentEditingInput contentEditingInput);
    @Method(selector = "initWithPlaceholderForCreatedAsset:")
    protected native @Pointer long init(PHObjectPlaceholder placeholderForCreatedAsset);
    /*</methods>*/
}
