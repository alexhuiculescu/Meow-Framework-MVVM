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

package sample.ui.meowwidget.progressbars

import android.os.Bundle
import android.view.View
import meow.util.javaClass
import sample.R
import sample.databinding.FragmentProgressBarBinding
import sample.ui.base.BaseFragment

/**
 * Dash Fragment.
 *
 * @author  Hamidreza Etebarian
 * @version 1.0.0
 * @since   2020-04-05
 */

class ProgressBarFragment : BaseFragment<FragmentProgressBarBinding, ProgressBarViewModel>() {

    override fun layoutId() = R.layout.fragment_progress_bar
    override fun viewModelClass() = javaClass<ProgressBarViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun initViewModel() {
        binding.viewModel = viewModel
    }

    override fun observeViewModel() {

    }

}