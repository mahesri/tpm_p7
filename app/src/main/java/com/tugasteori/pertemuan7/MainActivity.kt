package com.tugasteori.pertemuan7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tugasteori.pertemuan7.model.Riyadi
import com.tugasteori.pertemuan7.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background){

                    Profilku()
                }
            }
        }
    }
}

@Composable
fun Profilku() {

    Idcard(Riyadi(R.string.riyadi1, R.string.riyadi2, R.drawable.riyadi1))
}

@Composable
fun Idcard(riyadi: Riyadi, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {

        Column {

            Image(
                painter = painterResource(riyadi.imageResourceId),
                contentDescription = stringResource(riyadi.stringResourceId1),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(390.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                text = LocalContext.current.getString(riyadi.stringResourceId1),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.displayMedium

            )

            Text(
                text = LocalContext.current.getString(riyadi.stringResourceId2),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )

        }

    }
}


@Preview(showBackground = true)
@Composable
fun ProfilkuPreview() {
    Idcard(Riyadi(R.string.riyadi1, R.string.riyadi2, R.drawable.riyadi1))

}