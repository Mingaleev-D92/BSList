package com.example.bslist.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bslist.databinding.FragmentShoppingListBinding


class ShoppingListFragment : Fragment() {

   private var mBinding: FragmentShoppingListBinding? = null
   private val binding get() = mBinding!!

   override fun onCreateView(
      inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?
   ): View {
      mBinding = FragmentShoppingListBinding.inflate(inflater, container, false)
      return binding.root
   }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)
   }

   override fun onDestroy() {
      super.onDestroy()
      mBinding = null
   }


}