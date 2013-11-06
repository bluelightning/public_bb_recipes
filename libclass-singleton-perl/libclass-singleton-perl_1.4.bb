SUMMARY = "Class::Singleton - Implementation of a 'Singleton' class"
AUTHOR = "Andy Wardley <cpan@wardley.org>"
HOMEPAGE = "https://metacpan.org/module/Class::Singleton"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=f470b70809f5f1db3e05c17d4cf22568"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AB/ABW/Class-Singleton-${PV}.tar.gz"
SRC_URI[md5sum] = "a18b108ab97e2107cbbe816d2b3e2ee3"
SRC_URI[sha256sum] = "cfafc6e7c842e04fc11cc3e700551461a6aaa0b139470273aea2f29026e79150"

S = "${WORKDIR}/Class-Singleton-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
