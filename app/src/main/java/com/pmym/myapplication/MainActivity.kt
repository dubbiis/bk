package com.pmym.myapplication

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.pmym.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}
@Composable
fun carruseldos(
    modifier: Modifier = Modifier
) {
    // Implement composable here
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.height(168.dp)
    )
    {
        items(carrusel_dos) { item ->
            carrusel(item.drawable)

        }
    }
    @Composable
    fun burguercercanos(modifier: Modifier = Modifier) {
        Row {
            Column {
                Text(text = "TU BK MAS CERCANO")
            }
            Spacer(modifier = Modifier.width(180.dp))
            Column {
                Text(text = "VER TODOS")
            }
        }


    }


    @Composable
    fun SootheNavigationRail(modifier: Modifier = Modifier) {

        Row {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.home),
                    contentDescription = null
                )
                Text(text = "Home")
            }
            Spacer(modifier = Modifier.width(20.dp)) //este spacer me separa los iconos
            Column {
                Image(
                    painter = painterResource(id = R.drawable.mybk),
                    contentDescription = null,
                    modifier = Modifier
                        .width(90.dp)
                )
                Text(text = "My Burger King")
            }
            Spacer(modifier = Modifier.width(20.dp)) //este spacer me separa los iconos
            Column {
                Image(
                    painter = painterResource(id = R.drawable.carta),
                    contentDescription = null,
                    modifier = Modifier
                        .width(90.dp)
                )
                Text(text = "Carta")
            }
            Spacer(modifier = Modifier.width(20.dp)) //este spacer me separa los iconos
            Column {
                Image(
                    painter = painterResource(id = R.drawable.servicios),
                    contentDescription = null,
                    modifier = Modifier
                        .width(90.dp)
                )
                Text(text = "Servicios")
            }
            Spacer(modifier = Modifier.width(20.dp)) //este spacer me separa los iconos
            Column {
                Image(
                    painter = painterResource(id = R.drawable.perfil),
                    contentDescription = null,
                    modifier = Modifier
                        .width(90.dp)
                )
                Text(text = "Perfil")
            }
        }

    }

    private val carrusel_dos = listOf(
        R.drawable.carruno,
        R.drawable.carrdos,
        R.drawable.carrtres,
        R.drawable.carrcuatro

    ).map { carrusel() }

    private data class carrusel(
        @DrawableRes val drawable: Int)




@Preview(showBackground = true,  backgroundColor = 0xFFF3CA8D
)
@Composable
fun carruseldosPreview() {
    carruseldos()
}

@Preview(showBackground = true,  backgroundColor = 0xFFF3CA8D
)
@Composable
fun burguercercanosPreview() {
    burguercercanos()
}

@Preview(showBackground = true,  backgroundColor = 0xFFF3CA8D
)
@Composable
fun SootheNavigationRailPreview() {
    SootheNavigationRail()
}
