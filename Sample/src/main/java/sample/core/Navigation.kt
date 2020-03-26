/*
 * Copyright (C) 2020 Hamidreza Etebarian & Ali Modares.
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

package sample.core

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavController
import sample.R

/**
 * Navigation Extensions.
 *
 * @author  Hamidreza Etebarian
 * @version 1.0.0
 * @since   2020-03-13
 */
fun NavController.actionToAlerts(message: String) =
    navigate(ActionOnlyNavDirections(R.id.actionToAlerts).apply {
        arguments.putString("message", message)
    })
fun NavController.actionToTabLayout() = navigate(ActionOnlyNavDirections(R.id.actionToTabLayout))
fun NavController.actionToUserDetail() = navigate(ActionOnlyNavDirections(R.id.actionToUserDetail))
fun NavController.actionToUserIndex() = navigate(ActionOnlyNavDirections(R.id.actionToUserIndex))
fun NavController.actionToCustomDialog() =
    navigate(ActionOnlyNavDirections(R.id.actionToCustomDialog))
