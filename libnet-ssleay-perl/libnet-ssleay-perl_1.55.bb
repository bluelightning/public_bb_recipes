SUMMARY = "Net::SSLeay module contains perl bindings to openssl (http://www.openssl.org) library."
AUTHOR = "Mike McCauley <mikeern@airspayce.com>"
HOMEPAGE = "https://metacpan.org/module/Net::SSLeay"
SECTION = "libs"
LICENSE = "OpenSSL"
LIC_FILES_CHKSUM = "file://META.yml;md5=9885c1f5b3a5ad2f96a705a795a45d79"

DEPENDS += "openssl"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MI/MIKEM/Net-SSLeay-${PV}.tar.gz"
SRC_URI[md5sum] = "473b8d66ca69d5784bb0e428721f58e0"
SRC_URI[sha256sum] = "8cd5f09722e07b4e436102cb3a4b93623d753c171665ca9752c3b39a62ea3a79"

S = "${WORKDIR}/Net-SSLeay-${PV}"

EXTRA_CPANFLAGS = "INC='-I${STAGING_INCDIR}' LIBS='-L${STAGING_LIBDIR} -lssl -lcrypto -lz'"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}
