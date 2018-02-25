package com.example.android.AsriNovianto_1202150023_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MinumanAdapter mAdapter;

    public static ArrayList<MinumanItem> DATAS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);

        DATAS = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1);
        mAdapter = new MinumanAdapter(DATAS);
        recyclerView.setAdapter(mAdapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }

   //Pada langkah ini kita akan membuat List yang akan muncul terlebih dulu dan juga berisi deskripsi dan infonya

    public ArrayList<MinumanItem> isi(){
        ArrayList<MinumanItem> data = new ArrayList<>();
        data.add(new MinumanItem("Aqua","Ini adalah AMDK merk AQUA","Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.n. ",R.drawable.aqua));
        data.add(new MinumanItem("Aqua","Ini adalah AMDK merk AQUA","Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang. Kini The Coca-Cola Company merupakan pemilik merek dagang Ades, menggantikan PT. Akasha Wira Internasional atau PT. AdeS Waters Indonesia, pemilik merek dagang Ades sebelumnya. ",R.drawable.ades));
        data.add(new MinumanItem("Amidis","Ini adalah AMDK merk AMIDIS","AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida.",R.drawable.amidis));
        data.add(new MinumanItem("Cleo","Ini adalah AMDK merk CLEAO","Clue adalah salah satu minuman mineral yang ada diindonesia",R.drawable.cleo));
        data.add(new MinumanItem("Club","Ini adalah AMDK merk CLUB","Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk.",R.drawable.club));
        data.add(new MinumanItem("Equil","Ini adalah AMDK merk EQUIL","EQUIL mungkin masih asing di telinga kebanyakan masyarakat Indonesia. Namun merk air mineral murni ini sudah cukup dikenal kalangan menengah atas dan ekspatriat. Equil kerap hadir di meja restoran fine dining, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet.",R.drawable.equil));
        data.add(new MinumanItem("Evian","Ini adalah AMDK merk EVIAN","Evian adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman.",R.drawable.evian));
        data.add(new MinumanItem("Le Minerale","Ini adalah AMDK merk LE MINERALE","Le Minerale diproduksi oleh PT Tirta Frisindo Jaya yang tak lain adalah anak usaha Grup Mayora. Le Minerale ini merupakan salah satu produk yang paling bontot dimiliki Mayora.",R.drawable.leminerale));
        data.add(new MinumanItem("Nestle","Ini adalah AMDK merk NESTLE","Nestlé Indonesia adalah anak perusahaan Nestlé S.A., produsen makanan dan minuman terbesar di dunia yang berkantor pusat di Vevey, Swiss dan telah beroperasi selama 150 tahun.",R.drawable.nestle));
        data.add(new MinumanItem("Pristine","Ini adalah AMDK merk PRISTINE","Super Wahana Tehno telah memproduksi dan meluncurkan produk baru yaitu : air mineral ionisasi,untuk yang pertama kali dan satu-satunya di Indonesia dengan merk PRISTINE.",R.drawable.pristine));
        data.add(new MinumanItem("Vit","Ini adalah AMDK merk VIT"," VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta.",R.drawable.vit));
        return data;
    }
}
