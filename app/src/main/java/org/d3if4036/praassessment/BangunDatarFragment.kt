package org.d3if4036.praassessment


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if4036.praassessment.databinding.FragmentBangunDatarBinding


/**
 * A simple [Fragment] subclass.
 *
 */
class BangunDatarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentBangunDatarBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_bangun_datar, container, false)
        binding.bangunDatar = this
        binding.btnPersegiPanjang.setOnClickListener { v: View? ->
            v!!.findNavController().navigate(R.id.action_bangunDatarFragment_to_persegiPanjangFragment)
        }

        binding.btnSegitiga.setOnClickListener { v: View? ->
            v!!.findNavController().navigate(R.id.action_bangunDatarFragment_to_segitigaSikusikuFragment)
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }
}
