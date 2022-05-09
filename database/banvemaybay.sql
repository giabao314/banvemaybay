-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 09, 2022 at 07:32 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `banvemaybay`
--

-- --------------------------------------------------------

--
-- Table structure for table `chuyenbay`
--

CREATE TABLE `chuyenbay` (
  `maChuyenBay` int(11) NOT NULL,
  `maTuyenBay` int(11) NOT NULL,
  `maMayBay` int(11) NOT NULL,
  `soLgVeCL` int(11) NOT NULL,
  `ngayCatCanh` date NOT NULL,
  `ngayHaCanh` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `cthoadon`
--

CREATE TABLE `cthoadon` (
  `maHD` int(11) NOT NULL,
  `maLoaiVe` int(11) NOT NULL,
  `maVeKH` int(11) NOT NULL,
  `soLgVe` int(11) NOT NULL,
  `thue` double NOT NULL,
  `thanhTien` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `hangbay`
--

CREATE TABLE `hangbay` (
  `maHangBay` int(11) NOT NULL,
  `tenHangBay` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `maHD` int(11) NOT NULL,
  `maKH` int(11) NOT NULL,
  `maNV` int(11) NOT NULL,
  `maKM` int(11) NOT NULL,
  `ngayLap` date NOT NULL,
  `tongTien` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `maKH` int(11) NOT NULL,
  `hoKH` varchar(100) NOT NULL,
  `tenKH` varchar(100) NOT NULL,
  `gioiTinh` varchar(50) NOT NULL,
  `ngaySinh` date NOT NULL,
  `sdt` varchar(20) NOT NULL,
  `tongChiTieu` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `khuyenmai`
--

CREATE TABLE `khuyenmai` (
  `maKM` int(11) NOT NULL,
  `tenKM` varchar(50) NOT NULL,
  `dieuKienLoai` int(11) NOT NULL,
  `dieuKienSL` int(11) NOT NULL,
  `dieuKienGia` int(11) NOT NULL,
  `phanTramKM` int(11) NOT NULL,
  `ngayBD` date NOT NULL,
  `ngayKT` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `loaive`
--

CREATE TABLE `loaive` (
  `maLoaiVe` int(11) NOT NULL,
  `tenLoaiVe` varchar(50) NOT NULL,
  `donGia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `maybay`
--

CREATE TABLE `maybay` (
  `maMayBay` int(11) NOT NULL,
  `maHangBay` int(11) NOT NULL,
  `tenMayBay` varchar(50) NOT NULL,
  `soLgGhe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `maNV` int(11) NOT NULL,
  `hoNV` varchar(100) NOT NULL,
  `tenNV` varchar(100) NOT NULL,
  `gioiTinh` varchar(50) NOT NULL,
  `ngaySinh` date NOT NULL,
  `sdt` varchar(20) NOT NULL,
  `luong` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sanbay`
--

CREATE TABLE `sanbay` (
  `maSanBay` int(11) NOT NULL,
  `tenSanBay` varchar(50) NOT NULL,
  `thanhPho` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tuyenbay`
--

CREATE TABLE `tuyenbay` (
  `maTuyenBay` int(11) NOT NULL,
  `sanBayCatCanh` int(11) NOT NULL,
  `sanBayHaCanh` int(11) NOT NULL,
  `gioCatCanh` time NOT NULL,
  `gioHaCanh` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `ve`
--

CREATE TABLE `ve` (
  `maVe` int(11) NOT NULL,
  `maChuyenBay` int(11) NOT NULL,
  `maLoaiVe` int(11) NOT NULL,
  `maGhe` varchar(50) NOT NULL,
  `gioLenMayBay` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `vekh`
--

CREATE TABLE `vekh` (
  `maVeKH` int(11) NOT NULL,
  `maVe` int(11) NOT NULL,
  `maKH` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chuyenbay`
--
ALTER TABLE `chuyenbay`
  ADD PRIMARY KEY (`maChuyenBay`),
  ADD KEY `maTuyenBay` (`maTuyenBay`,`maMayBay`),
  ADD KEY `maMayBay` (`maMayBay`);

--
-- Indexes for table `cthoadon`
--
ALTER TABLE `cthoadon`
  ADD PRIMARY KEY (`maHD`,`maLoaiVe`),
  ADD KEY `maLoaiVe` (`maLoaiVe`),
  ADD KEY `maVeKH` (`maVeKH`);

--
-- Indexes for table `hangbay`
--
ALTER TABLE `hangbay`
  ADD PRIMARY KEY (`maHangBay`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`maHD`),
  ADD KEY `maKH` (`maKH`,`maNV`,`maKM`),
  ADD KEY `maNV` (`maNV`),
  ADD KEY `maKM` (`maKM`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`maKH`);

--
-- Indexes for table `khuyenmai`
--
ALTER TABLE `khuyenmai`
  ADD PRIMARY KEY (`maKM`);

--
-- Indexes for table `loaive`
--
ALTER TABLE `loaive`
  ADD PRIMARY KEY (`maLoaiVe`);

--
-- Indexes for table `maybay`
--
ALTER TABLE `maybay`
  ADD PRIMARY KEY (`maMayBay`),
  ADD KEY `maHangBay` (`maHangBay`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`maNV`);

--
-- Indexes for table `sanbay`
--
ALTER TABLE `sanbay`
  ADD PRIMARY KEY (`maSanBay`);

--
-- Indexes for table `tuyenbay`
--
ALTER TABLE `tuyenbay`
  ADD PRIMARY KEY (`maTuyenBay`),
  ADD KEY `sanBayCatCanh` (`sanBayCatCanh`,`sanBayHaCanh`),
  ADD KEY `sanBayHaCanh` (`sanBayHaCanh`);

--
-- Indexes for table `ve`
--
ALTER TABLE `ve`
  ADD PRIMARY KEY (`maVe`),
  ADD KEY `maChuyenBay` (`maChuyenBay`,`maLoaiVe`),
  ADD KEY `maLoaiVe` (`maLoaiVe`);

--
-- Indexes for table `vekh`
--
ALTER TABLE `vekh`
  ADD PRIMARY KEY (`maVeKH`),
  ADD KEY `maVe` (`maVe`,`maKH`),
  ADD KEY `maKH` (`maKH`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chuyenbay`
--
ALTER TABLE `chuyenbay`
  MODIFY `maChuyenBay` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `hangbay`
--
ALTER TABLE `hangbay`
  MODIFY `maHangBay` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `maHD` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `khachhang`
--
ALTER TABLE `khachhang`
  MODIFY `maKH` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `khuyenmai`
--
ALTER TABLE `khuyenmai`
  MODIFY `maKM` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `loaive`
--
ALTER TABLE `loaive`
  MODIFY `maLoaiVe` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `maybay`
--
ALTER TABLE `maybay`
  MODIFY `maMayBay` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `maNV` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `sanbay`
--
ALTER TABLE `sanbay`
  MODIFY `maSanBay` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tuyenbay`
--
ALTER TABLE `tuyenbay`
  MODIFY `maTuyenBay` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `ve`
--
ALTER TABLE `ve`
  MODIFY `maVe` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `vekh`
--
ALTER TABLE `vekh`
  MODIFY `maVeKH` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chuyenbay`
--
ALTER TABLE `chuyenbay`
  ADD CONSTRAINT `chuyenbay_ibfk_1` FOREIGN KEY (`maMayBay`) REFERENCES `maybay` (`maMayBay`),
  ADD CONSTRAINT `chuyenbay_ibfk_2` FOREIGN KEY (`maTuyenBay`) REFERENCES `tuyenbay` (`maTuyenBay`);

--
-- Constraints for table `cthoadon`
--
ALTER TABLE `cthoadon`
  ADD CONSTRAINT `cthoadon_ibfk_1` FOREIGN KEY (`maVeKH`) REFERENCES `vekh` (`maVeKH`),
  ADD CONSTRAINT `cthoadon_ibfk_2` FOREIGN KEY (`maLoaiVe`) REFERENCES `loaive` (`maLoaiVe`),
  ADD CONSTRAINT `cthoadon_ibfk_3` FOREIGN KEY (`maHD`) REFERENCES `hoadon` (`maHD`);

--
-- Constraints for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`),
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`maNV`) REFERENCES `nhanvien` (`maNV`),
  ADD CONSTRAINT `hoadon_ibfk_3` FOREIGN KEY (`maKM`) REFERENCES `khuyenmai` (`maKM`);

--
-- Constraints for table `maybay`
--
ALTER TABLE `maybay`
  ADD CONSTRAINT `maybay_ibfk_1` FOREIGN KEY (`maHangBay`) REFERENCES `hangbay` (`maHangBay`);

--
-- Constraints for table `tuyenbay`
--
ALTER TABLE `tuyenbay`
  ADD CONSTRAINT `tuyenbay_ibfk_1` FOREIGN KEY (`sanBayCatCanh`) REFERENCES `sanbay` (`maSanBay`),
  ADD CONSTRAINT `tuyenbay_ibfk_2` FOREIGN KEY (`sanBayHaCanh`) REFERENCES `sanbay` (`maSanBay`);

--
-- Constraints for table `ve`
--
ALTER TABLE `ve`
  ADD CONSTRAINT `ve_ibfk_1` FOREIGN KEY (`maChuyenBay`) REFERENCES `chuyenbay` (`maChuyenBay`),
  ADD CONSTRAINT `ve_ibfk_2` FOREIGN KEY (`maLoaiVe`) REFERENCES `loaive` (`maLoaiVe`);

--
-- Constraints for table `vekh`
--
ALTER TABLE `vekh`
  ADD CONSTRAINT `vekh_ibfk_1` FOREIGN KEY (`maVe`) REFERENCES `ve` (`maVe`),
  ADD CONSTRAINT `vekh_ibfk_2` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
