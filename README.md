AppJava Basdat

--Autentikasi Login Admin--
Cek apakah username dan password sesuai dengan data yang ada pada database.

--Menu admin--

A. --Manajemen Jadwal Rapat-- 
submenu:
1.Buat Jadwal Rapat. (Trigger Notif) [Create]
Input data Pemesan, Peserta rapat dan ruang yang dipakai, Waktu rapat (Hari dan Jam).
2.Cek Ruang Yang tersedia [Read]
Tampilkan daftar ruang dan fasilitas ruang.
3.Update Jadwal Rapat. [Update]
Ubah Jadwal (Hari/Jam), Ubah uang yang dipakai.
4.Batalkan Jadwal Rapat. [Delete]
Menghapus data pemesanan.

B. --Manajemen Ruang Rapat--
submenu:
1.Lihat Semua Ruang Rapat 
2.Ubah Spesifikasi Ruang Rapat 
Status, Fasilitias ruang. 

C.--Rekap Ruang (Call Stored Procedure)--
Cek rekap penggunaan ruang dalam 1 minggu / bulan.

D.--Manajemen Admin--
submenu:
1.Lihat daftar user admin
2.Ubah Password user admin
3.Tambah User admin
4.Delete User admin
