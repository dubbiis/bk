package com.pmym.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    Column {

                        cabecera()
                        carruseluno()
                        cupones()
                        carruseldos()
                        Spacer(modifier = Modifier.padding(10.dp))
                        burguercercanos()
                        imagen_mapa()
                        SootheNavigationRail()


                    }
                }
            }
        }
    }
}
/////////////////////////////  CARRUSEL 1   ////////////////////////////////
@Composable
fun carruseluno(
    modifier: Modifier = Modifier
) {
    LazyRow()
    {
        items(carrusel_uno) {
                item -> imagen_carrusel_uno(item.drawable)}}}


/////////////////////////////  CARRUSEL 2   ////////////////////////////////
@Composable
fun carruseldos(
    modifier: Modifier = Modifier
) {
    LazyRow()
   {
     items(carrusel_dos) {
          item -> imagen_carrusel(item.drawable)}}}

/////////////////////////////  FUNCION IMAGENES CARRUSEL   ////////////////////////////////
@Composable
fun imagen_carrusel(
    @DrawableRes drawable: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally
         )
    {
        Image(
            painter = painterResource(drawable),
            contentDescription = null,
           // contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(88.dp)

        )}}
@Composable
fun imagen_carrusel_uno(
    @DrawableRes drawable: Int,
    modifier: Modifier = Modifier
) {

        Image(
            painter = painterResource(drawable),
            contentDescription = null,
            // contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(500.dp)



        )}

/////////////////////////////  LISTA DE IMAGENES   ////////////////////////////////

private val carrusel_dos = listOf(
    R.drawable.carruno,
    R.drawable.carrdos,
    R.drawable.carrtres,
    R.drawable.carrcuatro,
    R.drawable.carrunocopia,
    R.drawable.carrdoscopia,
    R.drawable.carrtrescopia,
    R.drawable.carrcuatrocopia
).map {carrusel(it)}

private val carrusel_uno = listOf(
    R.drawable.cuponlargouno,
    R.drawable.cuponlargodos,
    R.drawable.cuponlargotres

).map {carrusel(it)}

/////////////////////////////  DATA CLASS DEL CARRUSEL   ////////////////////////////////
private data class carrusel(
    @DrawableRes val drawable: Int
)

/////////////////////////////  BOTONES DE TEXTO   ////////////////////////////////
@Composable
fun cupones(modifier: Modifier = Modifier) {
    Row {
        Column {
            Text(text = "CUPONES", color = MaterialTheme.colorScheme.tertiary)
        }
        Spacer(modifier = Modifier.width(180.dp))
        Column {
            Text(text = "Ver todos", color = Color.Red)
        } } }


@Composable
    fun burguercercanos(modifier: Modifier = Modifier) {
        Row {
            Column {
                Text(text = "TU BK MAS CERCANO",color = MaterialTheme.colorScheme.tertiary)
            }
            Spacer(modifier = Modifier.width(180.dp))
            Column {
                Text(text = "Ver todos", color = Color.Red)
            } } }




/////////////////////////////  IMAGEN MAPA   ////////////////////////////////
@Composable
    fun imagen_mapa(

    modifier: Modifier = Modifier
        ) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(
            painter = painterResource(R.drawable.mapa),
            contentDescription = null,
            // contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(88.dp)

        )}}
/////////////////////////////  MENU INFERIOR   ////////////////////////////////
    @Composable
    fun SootheNavigationRail(modifier: Modifier = Modifier) {

        Row (modifier = Modifier
            .height(50.dp)
            .width(600.dp)){
            Column {
                Image(
                    painter = painterResource(id = R.drawable.home),
                    contentDescription = null
                )
                Text(text = "Home", modifier = Modifier, color = MaterialTheme.colorScheme.tertiary)
            }
            Spacer(modifier = Modifier.width(20.dp)) //este spacer me separa los iconos
            Column {
                Image(
                    painter = painterResource(id = R.drawable.mybk),
                    contentDescription = null,
                    modifier = Modifier
                        .width(90.dp)
                )
                Text(text = "My Burger King", color = MaterialTheme.colorScheme.tertiary)
            }
            Spacer(modifier = Modifier.width(20.dp)) //este spacer me separa los iconos
            Column {
                Image(
                    painter = painterResource(id = R.drawable.carta),
                    contentDescription = null,
                    modifier = Modifier
                        .width(90.dp)
                )
                Text(text = "Carta", color = MaterialTheme.colorScheme.tertiary)
            }
            Spacer(modifier = Modifier.width(20.dp)) //este spacer me separa los iconos
            Column {
                Image(
                    painter = painterResource(id = R.drawable.servicios),
                    contentDescription = null,
                    modifier = Modifier
                        .width(90.dp)
                )
                Text(text = "Servicios", color = MaterialTheme.colorScheme.tertiary)
            }
            Spacer(modifier = Modifier.width(20.dp)) //este spacer me separa los iconos
            Column {
                Image(
                    painter = painterResource(id = R.drawable.perfil),
                    contentDescription = null,
                    modifier = Modifier
                        .width(90.dp)
                )
                Text(text = "Perfil", color = MaterialTheme.colorScheme.tertiary)
            }
        }

    }


@Composable
fun cabecera(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .height(50.dp)
            .width(600.dp)
    ) {
        Text(text = "2589", color = MaterialTheme.colorScheme.tertiary)
        Image(
            painter = painterResource(id = R.drawable.images),
            contentDescription = null,
            modifier = Modifier.size(10.dp)
        )
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Surface(
                color = Color.White , shape = RoundedCornerShape(16.dp),
            ) {
                Text(text = "Ver Mis ofertas", color = MaterialTheme.colorScheme.tertiary, textAlign = TextAlign.Center, fontSize = 12.sp)
            }
        }
    }
}



/////////////////////////////  PREVIEW   ////////////////////////////////
@Preview(showBackground = true,  backgroundColor = 0xFFF3CA8D
)
@Composable
fun cabeceraPreview() {
    cabecera()
}
@Preview(showBackground = true,  backgroundColor = 0xFFF3CA8D
)
@Composable
fun cuponesPreview() {
    cupones()
}
@Preview
    (showBackground = true,  backgroundColor = 0xFFF3CA8D
)

@Composable
fun carruseldosPreview() {
    carruseldos()
}

@Preview
    (showBackground = true,  backgroundColor = 0xFFF3CA8D
)

@Composable
fun carruselunoPreview() {
    carruseluno()
}

@Preview(showBackground = true,  backgroundColor = 0xFFF3CA8D
)
@Composable
fun burguercercanosPreview() {
    burguercercanos()
}
@Preview
    (showBackground = true,  backgroundColor = 0xFFF3CA8D)
@Composable
fun imagen_mapaPreview() {
    imagen_mapa()
}
@Preview(showBackground = true,  backgroundColor = 0xFFF3CA8D
)
@Composable
fun SootheNavigationRailPreview() {
    SootheNavigationRail()
}
