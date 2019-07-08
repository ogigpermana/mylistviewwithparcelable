package com.ogi.dicodingacd.mylistview;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ogi.dicodingacd.mylistview.adapter.PlanetAdapter;
import com.ogi.dicodingacd.mylistview.model.Planet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvPlanet;
    private static ArrayList<Planet> planets;

    private static ArrayList<Planet> generatePlanetData(){

        ArrayList<Planet> planets = new ArrayList<Planet>();

        Planet planet = new Planet();
        planet.setNamePlanet("Merkurius");
        planet.setDeskripsiPlanet("Merkurius adalah planet terkecil di dalam tata surya dan juga yang terdekat dengan Matahari dengan kala revolusi 88 hari dan kala rotasi 59 hari. Kecerahan planet ini berkisar di antara -2 sampai 5,5 dalam magnitudo tampak namun tidak mudah terlihat karena sudut pandangnya dengan Matahari kecil (dengan rentangan paling jauh sebesar 28,3 derajat. Merkurius hanya bisa terlihat pada saat subuh atau maghrib. ");
        planet.setUkuranPlanet(2439);
        planet.setGambarPlanet(R.drawable.merkurius);
        planets.add(planet);

        planet = new Planet();
        planet.setNamePlanet("Venus");
        planet.setDeskripsiPlanet("Venus adalah planet terdekat kedua dari Matahari setelah Merkurius. Planet ini mengorbit Matahari selama 224,7 hari Bumi.[11] Venus tidak memiliki satelit alami dan dinamai dari dewi cinta dan kecantikan dalam mitologi Romawi. Setelah Bulan, planet ini merupakan objek alami tercerah di langit malam, dengan magnitudo tampak Sebesar −4,6 yang cukup cerah untuk menghasilkan bayangan.[12] Venus merupakan planet inferior dengan sudut elongasi yang mencapai 47,8°. Kecerahan maksimal planet ini dapat dilihat segera sebelum matahari terbit atau setelah matahari terbenam, sehingga disebut Bintang Fajar atau Bintang Senja.");
        planet.setUkuranPlanet(6000);
        planet.setGambarPlanet(R.drawable.venus);
        planets.add(planet);

        planet = new Planet();
        planet.setNamePlanet("Bumi");
        planet.setDeskripsiPlanet("Bumi merupakan planet ketiga dari sistem tata surya, merupakan planet dimana kita sebagai manusia tinggal");
        planet.setUkuranPlanet(6371);
        planet.setGambarPlanet(R.drawable.bumi);
        planets.add(planet);

        planet = new Planet();
        planet.setNamePlanet("Mars");
        planet.setDeskripsiPlanet("Mars adalah planet terdekat keempat dari Matahari. Namanya diambil dari dewa perang Romawi, Mars. Planet ini sering dijuluki sebagai \"planet merah\" karena tampak dari jauh berwarna kemerah-kemerahan. Ini disebabkan oleh keberadaan besi(III) oksida di permukaan planet Mars.[6] Mars adalah planet bebatuan dengan atmosfer yang tipis.");
        planet.setUkuranPlanet(3389);
        planet.setGambarPlanet(R.drawable.mars);
        planets.add(planet);

        planet = new Planet();
        planet.setNamePlanet("Jupiter");
        planet.setDeskripsiPlanet("Yupiter adalah planet terdekat kelima dari Matahari setelah Merkurius, Venus, Bumi, dan Mars. Planet ini juga merupakan planet terbesar di Tata Surya.[10] Yupiter merupakan raksasa gas dengan massa seperseribu massa Matahari dan dua setengah kali jumlah massa semua planet lain di Tata Surya. Planet ini dan raksasa gas lain di Tata Surya (yaitu Saturnus, Uranus, dan Neptunus) kadang-kadang disebut planet Jovian atau planet luar. Yupiter telah dikenal oleh para astronom sejak zaman kuno,[11] dan dikaitkan dengan mitologi dan kepercayaan religius banyak peradaban. Bangsa Romawi menamai planet ini dari dewa Yupiter dalam mitologi Romawi.[12] Saat diamati dari Bumi, magnitudo tampak Yupiter dapat mencapai −2,94, yang cukup terang untuk menghasilkan bayangan,[13] dan juga menjadikannya objek tercerah ketiga di langit malam setelah Bulan dan Venus, walaupun Mars dapat menyaingi kecerahan Yupiter pada saat tertentu.");
        planet.setUkuranPlanet(69911);
        planet.setGambarPlanet(R.drawable.jupiter);
        planets.add(planet);

        planet = new Planet();
        planet.setNamePlanet("Saturnus");
        planet.setDeskripsiPlanet("Saturnus adalah sebuah planet di tata surya yang dikenal juga sebagai planet bercincin, dan merupakan planet terbesar kedua di tata surya setelah Jupiter. Jarak Saturnus sangat jauh dari Matahari, karena itulah Saturnus tampak tidak terlalu jelas dari Bumi. Saturnus berevolusi dalam waktu 29,46 tahun. Setiap 378 hari, Bumi, Saturnus dan Matahari akan berada dalam satu garis lurus. Selain berevolusi, Saturnus juga berotasi dalam waktu yang sangat singkat, yaitu 10 jam 40 menit 24 detik.");
        planet.setUkuranPlanet(58232);
        planet.setGambarPlanet(R.drawable.saturnus);
        planets.add(planet);

        planet = new Planet();
        planet.setNamePlanet("Uranus");
        planet.setDeskripsiPlanet("Uranus (berasal dari nama Latin Ūranus untuk nama dewa Yunani Οὐρανός) adalah planet ketujuh dari Matahari. Uranus merupakan planet yang memiliki jari-jari terbesar ketiga sekaligus massa terbesar keempat di Tata Surya. Uranus juga merupakan satu-satunya planet yang namanya berasal dari tokoh dalam mitologi Yunani, dari versi Latinisasi nama dewa langit Yunani Ouranos.");
        planet.setUkuranPlanet(25362);
        planet.setGambarPlanet(R.drawable.uranus);
        planets.add(planet);

        planet = new Planet();
        planet.setNamePlanet("Neptunus");
        planet.setDeskripsiPlanet("Neptunus merupakan planet terjauh (kedelapan) jika ditinjau dari Matahari. Planet ini dinamai dari dewa lautan Romawi. Neptunus merupakan planet terbesar keempat berdasarkan diameter (49.530 km) dan terbesar ketiga berdasarkan massa. Massa Neptunus tercatat 17 kali lebih besar daripada Bumi, dan sedikit lebih besar daripada Uranus.[9] Neptunus mengorbit Matahari pada jarak 30,1 sa atau sekitar 4.450 juta km. Periode rotasi planet ini adalah 16,1 jam, sedangkan periode revolusinya adalah 164,8 tahun. Simbol astronomisnya adalah ♆, yang merupakan trisula dewa Neptunus.");
        planet.setUkuranPlanet(24622);
        planet.setGambarPlanet(R.drawable.neptunus);
        planets.add(planet);

        return planets;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        lvPlanet = findViewById(R.id.list_planet);

        planets = generatePlanetData();

        PlanetAdapter adapter = new PlanetAdapter(this, planets);
        lvPlanet.setAdapter(adapter);

        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent myPlanetDetail = new Intent(MainActivity.this, DetailActivity.class);
                myPlanetDetail.putExtra(DetailActivity.EXTRA_PLANET, planets.get(position));
                startActivity(myPlanetDetail);
            }
        };

        lvPlanet.setOnItemClickListener(listener);
    }
}
