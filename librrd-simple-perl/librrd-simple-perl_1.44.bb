SUMMARY = "Simple round-Robin database interface"
AUTHOR = "Nicola Worthington <nicolaw@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/RRD::Simple"
SECTION = "libs"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

RDEPENDS_${PN} = " \
                 perl-module-carp \
                 perl-module-file-basename \
                 perl-module-file-copy \
                 perl-module-file-spec \
                 perl-module-file-temp \
                 perl-module-posix \
                 rrdtool \
                 "

SRC_URI = "http://cpan.metacpan.org/authors/id/N/NI/NICOLAW/RRD-Simple-${PV}.tar.gz"
SRC_URI[md5sum] = "cddfd8b22310946974af7762e1778a7e"
SRC_URI[sha256sum] = "6ddda37bc49adeeb2ccc89d0ef320ea2f3287799fa4186ba9a54d2124efb473f"

S = "${WORKDIR}/RRD-Simple-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
