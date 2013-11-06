SUMMARY = "File::Temp Perl module from CPAN"
AUTHOR = "David Golden <kwilliams@cpan.org>"
HOMEPAGE = "http://github.com/Perl-Toolchain-Gang/File-Temp"
SECTION = "libs"
LICENSE = "GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c68716a77a664f3405c40a5125351c9"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/File-Temp-${PV}.tar.gz"
SRC_URI[md5sum] = "75a8aec1916ebbe88988ce68e84ccdd7"
SRC_URI[sha256sum] = "c5c7706ddee2ccbdad083d6905ba9e1ab1fa34ad1733b91d46cd517510bb238c"

S = "${WORKDIR}/File-Temp-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-file-path \
                   libfile-spec-perl \
                   "

BBCLASSEXTEND = "native"
