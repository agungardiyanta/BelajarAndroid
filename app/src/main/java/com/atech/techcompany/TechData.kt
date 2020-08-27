package com.atech.techcompany

object TechData{
    private val techName = arrayOf(
        "Google",
        "Tesla",
        "Microsoft",
        "Apple",
        "Gojek",
        "Traveloka",
        "Tokopedia",
        "Asus",
        "Samsung",
        "Facebook"

    )

    private  val techDetail = arrayOf(
        "Google LLC adalah sebuah perusahaan multinasional Amerika Serikat yang berkekhususan pada jasa dan produk Internet. Produk-produk tersebut meliputi teknologi pencarian, komputasi web, perangkat lunak, dan periklanan daring. Sebagian besar labanya berasal dari AdWords",
        "Tesla, Inc. adalah sebuah perusahaan otomotif dan penyimpanan energi asal Amerika Serikat yang didirikan oleh Elon Musk, Martin Eberhard, Marc Tarpenning, JB Straubel dan Ian Wright, serta berbasis di Palo Alto, California.",
        "Microsoft Corporation adalah sebuah perusahaan multinasional Amerika Serikat yang berkantor pusat di Redmond, Washington, Amerika Serikat yang mengembangkan, membuat, memberi lisensi, dan mendukung berbagai produk dan jasa terkait dengan komputer.",
        "Apple Inc. adalah perusahaan teknologi multinasional yang berpusat di Cupertino, California, yang merancang, mengembangkan, dan menjual barang elektronik konsumen, perangkat lunak komputer, dan layanan daring.",
        "Gojek (sebelumnya ditulis GO-JEK) merupakan sebuah perusahaan teknologi asal Indonesia yang melayani angkutan melalui jasa ojek",
        "Traveloka adalah perusahaan yang menyediakan layanan pemesanan tiket pesawat dan hotel secara daring dengan fokus perjalanan domestik di Indonesia. Didirikan pada tahun 2012 oleh Ferry Unardi, Derianto Kusuma, dan Albert Zhang",
        "Tokopedia merupakan perusahaan teknologi Indonesia dengan misi mencapai pemerataan ekonomi secara digital. Sejak didirikan pada tahun 2009, Tokopedia telah bertransformasi menjadi sebuah unicorn yang berpengaruh tidak hanya di Indonesia tetapi juga di Asia Tenggara.",
        "Asustek Computer Inc. ditulis dengan gaya huruf kapital ASUS, adalah sebuah perusahaan berbasis di Taiwan yang memproduksi komponen komputer seperti papan induk, kartu grafis, dan notebook. Asus belakangan ini mulai memproduksi PDA, Telepon genggam, monitor LCD, tablet dan produk komputer lainnya.",
        "Samsung Group merupakan salah satu perusahaan elektronik terbesar di dunia. Didirikan oleh Lee Byung-chull pada tanggal 1 Maret 1938 di Daegu, Korea Selatan, perusahaan ini beroperasi di 58 negara dan memiliki lebih dari 208.000 pekerja.",
        "Facebook, Inc. adalah sebuah layanan jejaring sosial berkantor pusat di Menlo Park, California, Amerika Serikat yang diluncurkan pada bulan Februari 2004. Hingga September 2012, Facebook memiliki lebih dari satu miliar pengguna aktif, lebih dari separuhnya menggunakan telepon genggam."

    )

    private val techIcons = intArrayOf(
        R.drawable.google,
        R.drawable.tesla,
        R.drawable.microsoft,
        R.drawable.apple,
        R.drawable.gojek,
        R.drawable.traveloka,
        R.drawable.tokopedia,
        R.drawable.asus,
        R.drawable.samsung,
        R.drawable.facebook
    )

    private val techCeo = arrayOf(
        "Sundar Pichai",
        "Elon Musk",
        "Satya Nadella",
        "Tim Cook",
        "kevin Aluwi",
        "Ferry Unardi",
        "William tanuwijaya",
        "Samson Hu",
        "Kim Ki Nam",
        "Mark Zuckerberg"
    )

    private  val websiteTech = arrayOf(
        "https://about.google/",
        "https://www.tesla.com/",
        "https://www.microsoft.com/",
        "https://www.apple.com/",
        "https://www.gojek.com/",
        "https://www.traveloka.com/en/about-us",
        "https://www.tokopedia.com/about/",
        "https://www.asus.com/",
        "https://www.samsung.com/",
        "https://www.facebook.com/facebook"
    )

    val listData:ArrayList<TechComp>
        get() {
            val list = arrayListOf<TechComp>()
                for (position in techName.indices){
                    val tech = TechComp()
                    tech.name = techName[position]
                    tech.detail = techDetail[position]
                    tech.icons = techIcons[position]
                    tech.ceotech = techCeo[position]
                    tech.webtech = websiteTech[position]
                    list.add(tech)
                }
            return list
        }

}