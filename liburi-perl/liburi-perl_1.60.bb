DESCRIPTION = "This package contains the URI.pm module with friends. \
The module implements the URI class. URI objects can be used to access \
and manipulate the various components that make up these strings."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
PR = "r0"

LIC_FILES_CHKSUM = "file://README;beginline=26;endline=30;md5=6c33ae5c87fd1c4897714e122dd9c23d"

DEPENDS += "perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/URI-${PV}.tar.gz"
SRC_URI[md5sum] = "70f739be8ce28b8baba7c5920ffee4dc"
SRC_URI[sha256sum] = "1f92d3dc64acb8845e9917c945e22b9a5275aeb9ff924eb7873c3b7a5c0d2377"

RDEPENDS_${PN} += "libmime-base64-perl"

RPROVIDES_${PN} += "liburi-perl \
                   liburi-escape-perl \
                   liburi-heuristic-perl \
                   liburi-queryparam-perl \
                   liburi-split-perl \
                   liburi-urli-perl \
                   liburi-withbase-perl \
                   liburi-_punycody-perl \
                   liburi-data-perl \
                   liburi-file-perl \
                   liburi-ldap-perl \
                   liburi-file-base-perl \
                   liburi-file-fat-perl \
                   liburi-file-mac-perl \
                   liburi-file-os2-perl \
                   liburi-file-qnx-perl \
                   liburi-file-unix-perl \
                   liburi-file-win32-perl \
                   liburi-ftp-perl \
                   liburi-http-perl \
                   liburi-https-perl \
                   liburi-iri-perl \
                   liburi-ldapi-perl \
                   liburi-ldaps-perl \
                   liburi-mailto-perl \
                   liburi-mms-perl \
                   liburi-news-perl \
                   liburi-nttp-perl \
                   liburi-pop-perl \
                   liburi-rlogin-perl \
                   liburi-rsync-perl \
                   liburi-rtsp-perl \
                   liburi-rtspu-perl \
                   liburi-sip-perl \
                   liburi-sips-perl \
                   liburi-snews-perl \
                   liburi-ssh-perl \
                   liburi-telnet-perl \
                   liburi-tn3270-perl \
                   liburi-urn-perl \
                   liburi-urn-isbn-perl \
                   liburi-urn-old-perl \                   
                   "
                   
S = "${WORKDIR}/URI-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
