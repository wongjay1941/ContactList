package com.example.contactlist.ui.profile

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.contactlist.R
import com.example.contactlist.databinding.FragmentGalleryBinding
import com.example.contactlist.databinding.FragmentProfileBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    //Ways to display content of our fragment
    //#First method
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return binding.root
    }

    //#Second method
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editTextPersonName: EditText = view.findViewById(R.id.editTextTextPersonName)
        val editTextPhone: EditText = view.findViewById(R.id.editTextTextPhone)
        val buttonSave: Button = view.findViewById(R.id.buttonSave)

        buttonSave.setOnClickListener {
            Toast.makeText(context, "Record Saved", Toast.LENGTH_SHORT).show()
        }
    }

    //To hide 3 dots menu that display Settings
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.findItem(R.id.action_settings).setVisible(false)
    }
}