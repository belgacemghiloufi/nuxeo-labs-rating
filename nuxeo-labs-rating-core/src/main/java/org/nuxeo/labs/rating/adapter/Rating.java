/*
 * (C) Copyright 2016 Nuxeo SA (http://nuxeo.com/) and others.
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
 *
 * Contributors:
 *     
 */
package org.nuxeo.labs.rating.adapter;

/**
 * Created by Michaël on 1/21/2016.
 */
public interface Rating {

    void setRating(long rating);

    long getRating();

    String getUsername();

    void setUsername(String username);

    String getDocId();

    void setDocId(String docId);

    String getDocTitle();

    void setDocTitle(String docTitle);

    String getComment();

    void setComment(String comment);

    void copyValue(Rating rating);

}
