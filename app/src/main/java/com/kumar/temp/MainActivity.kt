package com.kumar.temp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import com.kumar.temp.ui.theme.TempTheme

class MainActivity : ComponentActivity() {

//    private val viewModel by viewModels<viewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TempTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel: viewModel by viewModels<viewModel>()
                    Greeting(
                        count = viewModel.count.collectAsState().value,
                        action = viewModel::action
                    )

                }
            }
        }
    }
}

@Composable
fun Greeting(count: Int, action: (operation) -> Unit) {

//    val count by remember {
//        mutableStateOf(0)
//    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(modifier = Modifier) {
            Button(
                onClick = { action(operation.onPlusClicked) },
                modifier = Modifier.size(100.dp)
            ) {
                Text(
                    text = "+",
                    fontSize = 40.sp
                )

            }
            Button(
                onClick = { action(operation.onMinusClicked) },
                modifier = Modifier.size(100.dp)
            ) {
                Text(
                    text = "-",
                    fontSize = 40.sp
                )

            }


        }

        Row {
            Text(
                text = "$count",
                textAlign = TextAlign.Center,
                fontSize = 32.sp,
            )
        }

    }


}

@Preview(showSystemUi = true)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TempTheme {

    }
}