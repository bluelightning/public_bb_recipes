SUMMARY = "DateTime::Locale and language-specific variants"
AUTHOR = "Dave Rolsky <autarch@urth.org>"
HOMEPAGE = "https://metacpan.org/release/DateTime-Locale"
SECTION = "libs"
LICENSE = "GPL-2.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a89fc6431f978476bd49e3f7a26a1a1e"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Locale-0.45.tar.gz"
SRC_URI[md5sum] = "8ba6a4b70f8fa7d987529c2e2c708862"
SRC_URI[sha256sum] = "8aa1b8db0baccc26ed88f8976a228d2cdf4f6ed4e10fc88c1501ecd8f3ccaf9c"

S = "${WORKDIR}/DateTime-Locale-${PV}"

inherit cpan

RDEPENDS_${PN} += "perl-module-params-validate \
                   liblist-moreutils-perl \
                   "

BBCLASSEXTEND = "native"
