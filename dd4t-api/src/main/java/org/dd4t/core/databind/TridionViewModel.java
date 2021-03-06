/*
 * Copyright (c) 2015 SDL, Radagio & R. Oudshoorn
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

package org.dd4t.core.databind;

import org.dd4t.core.util.TCMURI;
import org.joda.time.DateTime;

/**
 * @author R. Kempees
 * @since 12/11/14.
 */
public interface TridionViewModel extends BaseViewModel {

    TCMURI getTcmUri ();

    void setTcmUri (TCMURI tcmUri);

    TCMURI getTemplateUri ();

    void setTemplateUri (TCMURI tcmUri);

    DateTime getLastModified ();

    void setLastModified (DateTime lastModified);

    DateTime getLastPublishDate ();

    void setLastPublishDate (DateTime lastPublishDate);

    String getXPath (final String fieldName);

    void addXpmEntry (final String fieldName, final String xpath, final boolean multiValued);

    boolean setGenericComponentOnComponentPresentation ();

    boolean isMultiValued (final String fieldName);
}
