/*
 * Copyright 2017 Google Inc.
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

package com.google.cloud.tools.eclipse.appengine.validation;

import static org.junit.Assert.assertEquals;

import org.eclipse.core.resources.IMarker;
import org.junit.Test;

public class UndefinedServletElementTest {

  @Test
  public void testUndefinedServletElement() {
    DocumentLocation location = new DocumentLocation(3, 15);
    UndefinedServletElement element = new UndefinedServletElement("servlet", location, 17);
    assertEquals("servlet", element.getServletClassName());
    assertEquals(IMarker.SEVERITY_ERROR, element.getIMarkerSeverity());
    assertEquals("servlet could not be resolved", element.getMessage());
  }

}

