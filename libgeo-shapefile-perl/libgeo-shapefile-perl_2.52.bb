SUMMARY = "Perl extension for handling ESRI GIS Shapefiles. "
AUTHOR = "Jason Kohles <cpan@jasonkohles.com>"
HOMEPAGE = "https://metacpan.org/release/Geo-ShapeFile"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=1b275e131064b89430c71a473aac4b25"

RDEPENDS_${PN} = " \
                 perl-module-carp \
                 libio-file-perl \
                 libmath-trig-perl \
                 "

RPROVIDES_${PN} = " \
                  libgeo-shapefile-perl \
                  libgeo-shapefile-point-perl \
                  libgeo-shapefile-shape-perl \
                  "

SRC_URI = "http://cpan.metacpan.org/authors/id/J/JA/JASONK/Geo-ShapeFile-${PV}.tar.gz"
SRC_URI[md5sum] = "8626241afcc87d59460421c9fd1de285"
SRC_URI[sha256sum] = "6ccc2bd992d8474f473b3b33064baabd906d5a45afc75db035ab0136058a1edb"

S = "${WORKDIR}/Geo-ShapeFile-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
