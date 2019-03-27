package com.github.zawadz88.navigationcomponentplayground

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login_with_password.logMeInButton

class LoginWithPasswordFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_with_password, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        logMeInButton.setOnClickListener {
            val popBackStackResult = findNavController().popBackStack(R.id.collectiveLoginFragment, true)
            println("popBackStackResult: $popBackStackResult")
            if (popBackStackResult) return@setOnClickListener

            findNavController().popBackStack()
        }
    }
}
