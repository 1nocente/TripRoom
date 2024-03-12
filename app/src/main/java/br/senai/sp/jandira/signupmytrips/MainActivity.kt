package br.senai.sp.jandira.signupmytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.signupmytrips.ui.theme.SignUpMyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignUpMyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .height(height = 40.dp)
                .width(width = 120.dp)
                .background(
                    color = Color(0xFFCF06F0),
                    shape = RoundedCornerShape(0.dp, 0.dp, 0.dp, 18.dp)
                )
                .align(Alignment.End)
        ) {


        }

        Text(
            text = "Sign Up",
            fontSize = 35.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFFCF06F0),
            modifier = Modifier
                .padding(top = 30.dp, start = 130.dp)
        )


        Text(
            text = "Create a new account",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier
                .padding(top = 10.dp, start = 120.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.account),
            contentDescription = "account",
            modifier = Modifier
                .size(height = 100.dp, width = 500.dp)
                .padding(top = 10.dp)

        )

        OutlinedTextField(value = "Susanna Hoffs",
            onValueChange = {},
            label = { Text(text = "Username") },
            modifier = Modifier
                .padding(top = 30.dp, start = 20.dp)
                .width(350.dp)
                .height(66.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),
            shape = RoundedCornerShape(15.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Person, contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }


        )

        OutlinedTextField(value = "99999-0987",
            onValueChange = {},
            label = { Text(text = "Phone") },
            modifier = Modifier
                .padding(top = 10.dp, start = 20.dp)
                .width(350.dp)
                .height(66.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),
            shape = RoundedCornerShape(15.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Call, contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }


        )

        OutlinedTextField(value = "susanna@email.com",
            onValueChange = {},
            label = { Text(text = "E-mail") },
            modifier = Modifier
                .padding(top = 10.dp, start = 20.dp)
                .width(350.dp)
                .height(66.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),
            shape = RoundedCornerShape(15.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email, contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }


        )

        OutlinedTextField(value = "**********",
            onValueChange = {},
            label = { Text(text = "Password") },
            modifier = Modifier
                .padding(top = 10.dp, start = 20.dp)
                .width(350.dp)
                .height(66.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),
            shape = RoundedCornerShape(15.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock, contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }

        )

        Row (modifier = Modifier
            .padding(start = 20.dp, top = 20.dp)) {


            Box(
                modifier = Modifier
                    .height(height = 30.dp)
                    .width(width = 30.dp)
                    .background(color = Color.White)
                    .border(BorderStroke(width = 2.dp, color = Color(0xFFCF06F0)))


            ) {}

            Text(text = "Over 18?",
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(top = 5.dp, start = 5.dp))
        }

    Button(onClick = { /*TODO*/ },
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(Color(0xFFCF06F0)),
        modifier = (Modifier
            .width(width = 370.dp)
            .height(height = 60.dp)
            .padding(top = 20.dp, start = 20.dp)
                )
    ) {
        Text(
            text = "CREATE ACCOUNT", fontSize = 15.sp, fontWeight = FontWeight.ExtraBold
        )



    }

        Row {

            Text(
                text = "Already have an account?",
                color = Color(0xFFA09C9C),
                fontSize = 15.sp,
                letterSpacing = 0.sp,
                modifier = Modifier
                    .padding(top = 20.dp, start = 160.dp)
            )

            Text(
                text = "Sign in",
                color = Color(0xFFCF06F0),
                fontSize = 15.sp,
                letterSpacing = 0.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(top = 20.dp, start = 5.dp)
            )
        }
        Spacer(modifier = Modifier
            .height(20.dp))

        Column(
            modifier = Modifier
                .height(height = 40.dp)
                .width(width = 120.dp)
                .background(
                    color = Color(0xFFCF06F0),
                    shape = RoundedCornerShape(0.dp, 15.dp, 0.dp, 0.dp)
                )
                .align(Alignment.Start)


        ) {


        }

    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    SignUpMyTripsTheme {
        Greeting()
    }
}