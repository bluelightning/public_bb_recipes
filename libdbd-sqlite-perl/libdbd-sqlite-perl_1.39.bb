DESCRIPTION = "PERL database interface driver for the SQLite database."
SECTION = "libs"
LICENSE = "GPLv1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1726e2117494ba3e13e1c3d93f795360"
RDEPENDS_${PN} += "libdbi-perl \
          libfile-spec-perl \
          perl-module-scalar-util \
          libtest-harness-perl \
          libtest-more-perl \
          "

# This is a build-time dependency
DEPENDS = "libdbi-perl-native"

PR = "r4"

SRC_URI = "http://cpan.metacpan.org/authors/id/I/IS/ISHIGAKI/DBD-SQLite-${PV}.tar.gz"
SRC_URI[md5sum] = "8ca0719852fcbcbbee470c705eeff24a"
SRC_URI[sha256sum] = "9361b5f01c720e33349dcf4dc531220c399fa9e9cdbec948aa8171860b9a9214"

S = "${WORKDIR}/DBD-SQLite-${PV}"

inherit cpan
