package com.stackmobile.av2.view.telaprincipal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import com.stackmobile.av2.R
import com.stackmobile.av2.databinding.ActivityTelaprincipalBinding
import com.stackmobile.av2.view.formcadastro.formlogin.formlogin

class telaprincipal : AppCompatActivity() {

     //lateinit var binding: ActivityTelaprincipalBinding
     lateinit var  db : FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaprincipalBinding.bind(layoutInflater)
        setContentView(binding.root)

        binding.btDeslogar.setOnClickListener {view ->
            firebase.getInstance().signOut()
            val voltarTelaLogin = intent (this,formlogin::class.java)
            startActionMode(voltarTel
                    aLogin)
            finish()
    }
        binding.btGravarDados.setOnClickListener{

        }


}