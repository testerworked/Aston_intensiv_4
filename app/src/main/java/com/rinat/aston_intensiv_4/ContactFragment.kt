package com.rinat.aston_intensiv_4

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


private const val FIRST_FRAGMENT_KEY = "FIRST_FRAGMENT_KEY"
class ContactFragment : Fragment(R.layout.fragment_contact) {

    companion object {

        const val FIRST_FRAGMENT_TAG = "FIRST_FRAGMENT_TAG"

        fun getInstance(): FirstFragment {
            return FirstFragment().apply {
                arguments = bundleOf(FIRST_FRAGMENT_KEY to "value")
            }
        }
    }

    private lateinit var viewModel: ContactViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ContactViewModel::class.java)
        // TODO: Use the ViewModel
    }

}