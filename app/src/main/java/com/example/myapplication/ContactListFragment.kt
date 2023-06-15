package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import android.widget.ListView


private const val FIRST_FRAGMENT_KEY = "FIRST_FRAGMENT_KEY"


class ContactListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    data class Person(var name: String, var telephone: Int)
    var items = listOf(
        Person("Adam", 7999144),
        Person("Eva", 7999455),
        Person("Bob", 1999369),
        Person("Max", 8999369),
        Person("Vasya", 4969343),
        Person("Nik", 5979325),
        Person("Business", 2949369),
        Person("Sample", 6939358)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myListView = view.findViewById<ListView>(R.id.contactList)

        val adapter1 = ContactAdapter(view.context, items)

        //val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, items)
        myListView.adapter = adapter1
    }


    companion object {

        const val FIRST_FRAGMENT_TAG = "FIRST_FRAGMENT_TAG"

        @JvmStatic
        fun getInstance(): ContactListFragment {
            return ContactListFragment().apply {
                arguments = bundleOf(FIRST_FRAGMENT_KEY to "value")
            }
        }
    }
}