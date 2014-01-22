/*
 * Copyright 2013 Haulmont Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.haulmont.vaadin.sample

import com.vaadin.event.ShortcutAction
import com.vaadin.event.ShortcutListener
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.*

public class TextFieldVaadinUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        def layout = new VerticalLayout()

        def fieldQ = new SuperTextField("Find Q!")
        fieldQ.immediate = true
        fieldQ.addShortcutListener(new ShortcutListener("FindQ", ShortcutAction.KeyCode.ENTER, new int[0]) {
            @Override
            void handleAction(Object sender, Object target) {
                new Notification("Find Q!").show(getPage())
            }
        })
        layout.addComponent(fieldQ)

        def fieldW = new SuperTextField("Find W!")
        fieldW.immediate = true
        fieldW.addShortcutListener(new ShortcutListener("FindW", ShortcutAction.KeyCode.ENTER, new int[0]) {
            @Override
            void handleAction(Object sender, Object target) {
                new Notification("Find W!").show(getPage())
            }
        })
        layout.addComponent(fieldW)

        setContent(layout)
    }
}