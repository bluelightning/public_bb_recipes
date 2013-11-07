DESCRIPTION = "This package contains the URI.pm module with friends. \
The module implements the URI class. URI objects can be used to access \
and manipulate the various components that make up these strings."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

LIC_FILES_CHKSUM = "file://README;beginline=26;endline=30;md5=94b119f1a7b8d611efc89b5d562a1a50"

DEPENDS += "perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SM/SMUELLER/lib-${PV}.tar.gz"
SRC_URI[md5sum] = "8607ac4e0d9d43585ec28312f52df67c"
SRC_URI[sha256sum] = "72f63db9220098e834d7a38231626bd0c9b802c1ec54a628e2df35f3818e5a00"

S = "${WORKDIR}/lib-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}
